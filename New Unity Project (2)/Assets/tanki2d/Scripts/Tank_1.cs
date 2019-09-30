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
    }
}
