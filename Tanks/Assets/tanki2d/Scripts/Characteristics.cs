using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Characteristics : MonoBehaviour
{
    public GameObject bullet;
    public Transform startBarrel;

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown("space"))
        {
            fire();
            Destroy(bullet, 2);
        }
    }

    public void fire()
    {
        //if (Input.GetKeyDown("space"))
        //{
        //Vector3 spawnPoint = startBarrel.transform.position;
        //Quaternion spawnRoot = startBarrel.transform.rotation;
        //GameObject gun = Instantiate(bullet, spawnPoint, spawnRoot) as GameObject;
        //Rigidbody2D run = gun.GetComponent<Rigidbody2D>();
        //run.AddForce(gun.transform.forward * 30, ForceMode2D.Impulse);
        //Destroy(gun, 10);
        Instantiate(bullet, startBarrel.position, startBarrel.rotation);
        //}
    }
}
