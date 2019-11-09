using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Tank_1 : MonoBehaviour
{
    public GameObject w;
    public GameObject s;
    public GameObject a;
    public GameObject d;
    public GameObject tank;
    //public GameObject bullet;
    //public Transform startBarrel;
    float speed = 70;

    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {

        if (Input.GetKey("w"))
        {
            tank.transform.Translate(0, speed * Time.deltaTime, 0);
            w.SetActive(true);
            s.SetActive(false);
            a.SetActive(false);
            d.SetActive(false);
        }
        if (Input.GetKey("s"))
        {
            tank.transform.Translate(0, -speed * Time.deltaTime, 0);
            w.SetActive(false);
            s.SetActive(true);
            a.SetActive(false);
            d.SetActive(false);
        }
        if (Input.GetKey("a"))
        {
            tank.transform.Translate(-speed * Time.deltaTime, 0, 0);
            w.SetActive(false);
            s.SetActive(false);
            a.SetActive(true);
            d.SetActive(false);
        }
        if (Input.GetKey("d"))
        {
            tank.transform.Translate(speed * Time.deltaTime, 0, 0);
            w.SetActive(false);
            s.SetActive(false);
            a.SetActive(false);
            d.SetActive(true);
        }
        //if(Input.GetKeyDown("space"))
        //{
        //    fire();
        //    Destroy(bullet, 2);
        //}
    }

    //public void fire()
    //{
    //    //if (Input.GetKeyDown("space"))
    //    //{
    //        //Vector3 spawnPoint = startBarrel.transform.position;
    //        //Quaternion spawnRoot = startBarrel.transform.rotation;
    //        //GameObject gun = Instantiate(bullet, spawnPoint, spawnRoot) as GameObject;
    //        //Rigidbody2D run = gun.GetComponent<Rigidbody2D>();
    //        //run.AddForce(gun.transform.forward * 30, ForceMode2D.Impulse);
    //        //Destroy(gun, 10);
    //        Instantiate(bullet, startBarrel.position, startBarrel.rotation);
    //    //}
    //}
}
