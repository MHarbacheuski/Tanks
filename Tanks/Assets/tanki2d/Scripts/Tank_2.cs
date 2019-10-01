using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Tank_2 : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject i;
    public GameObject k;
    public GameObject j;
    public GameObject l;
    public GameObject tank2;
    float speed = 70;

    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {

        if (Input.GetKey("i"))
        {
            tank2.transform.Translate(0, speed * Time.deltaTime, 0);
            i.SetActive(true);
            k.SetActive(false);
            j.SetActive(false);
            l.SetActive(false);
        }
        if (Input.GetKey("k"))
        {
            tank2.transform.Translate(0, -speed * Time.deltaTime, 0);
            i.SetActive(false);
            k.SetActive(true);
            j.SetActive(false);
            l.SetActive(false);
        }
        if (Input.GetKey("j"))
        {
            tank2.transform.Translate(-speed * Time.deltaTime, 0, 0);
            i.SetActive(false);
            k.SetActive(false);
            j.SetActive(true);
            l.SetActive(false);
        }
        if (Input.GetKey("l"))
        {
            tank2.transform.Translate(speed * Time.deltaTime, 0, 0);
            i.SetActive(false);
            k.SetActive(false);
            j.SetActive(false);
            l.SetActive(true);
        }
    }
}
